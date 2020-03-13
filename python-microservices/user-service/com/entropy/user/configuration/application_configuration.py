import yaml
from pathlib import Path


class ApplicationConfiguration(object):
    def __init__(self):
        root_path = str(Path(__file__).parents[4])
        with open(root_path + '/' + 'application.yml', 'rb') as yml_file:
            cfg = yaml.load(yml_file)
        self.cfg = cfg

    def fetch_grpc_configuration(self):
        return self.cfg['grpc']