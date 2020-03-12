class Department(object):
    def __init__(self, description, name, id=None):
        self.description = description
        self.name = name
        self.id = id

    def get_id(self):
        return self.id

    def get_description(self):
        return self.description

    def get_name(self):
        return self.name