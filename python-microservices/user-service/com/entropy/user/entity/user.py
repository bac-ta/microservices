class User(object):
    def __init__(self, age, department_id, email, gender, name, phone_number, id=None):
        self.age = age
        self.department_id = department_id
        self.email = email
        self.gender = gender
        self.name = name
        self.phone_number = phone_number
        self.id = id

    def get_age(self):
        return self.age

    def get_department_id(self):
        return self.department_id

    def get_email(self):
        return self.email

    def get_gender(self):
        return self.gender

    def get_name(self):
        return self.name

    def get_phone_number(self):
        return self.phone_number

    def get_id(self):
        return self.id
   