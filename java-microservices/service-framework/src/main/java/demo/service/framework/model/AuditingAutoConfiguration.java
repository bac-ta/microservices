package demo.service.framework.model;

import java.util.Calendar;

import io.grpc.Context;

import demo.service.framework.FrameworkConfiguration;
import demo.service.framework.grpc.GrpcGlobals;
import demo.service.framework.utils.Dates;
import demo.service.framework.utils.Strings;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@AutoConfigureAfter(FrameworkConfiguration.class)
@ConditionalOnClass(MongoTemplate.class)
@NoArgsConstructor
public class AuditingAutoConfiguration {

    @Autowired
    private ApplicationContext context;


    @Bean
    public AuditorAware<String> auditorAwareProvider() {
        return () -> {
            final String defaultUser = getDefaultUser(context);
            try {
                String loginInfo = GrpcGlobals.LOGIN_INFO.get(Context.current());
                if (loginInfo == null || Strings.isEmpty(loginInfo)) {
                    return defaultUser;
                }
                return loginInfo;
            } catch (Exception e) {
                return defaultUser;
            }
        };
    }

    @Bean public DateTimeProvider dateTimeProvider() {
        return () -> {
            Calendar now = Calendar.getInstance();
            now.setTime(Dates.now());
            return now;
        };
    }

    private String getDefaultUser(ApplicationContext context) {
        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) context;
        DefaultListableBeanFactory beanRegistry = (DefaultListableBeanFactory) configurableApplicationContext.getBeanFactory();

        if (beanRegistry.containsBean("migration")) {
            return beanRegistry.getBean("migration", String.class);
        }
        return "system";
    }
}
