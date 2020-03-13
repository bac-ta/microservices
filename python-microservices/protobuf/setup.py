import os
from setuptools import setup


def read(fname):
    return open(os.path.join(os.path.dirname(__file__), fname)).read()

setup(
    name = "protobuf",
    version = "0.0.1",
    author = "Bac ta",
    author_email = "bac93.it@gmail.com",
    description = ("Grpc protobuf codes generate to proto files"),
    license = "BSD",
    keywords = "Example microservices with python and grpc",
    url = "https://github.com/bac-ta/microservices/tree/master/python-microservices/protobuf",
    packages=['grpc'],
    long_description=read('README'),
    project_urls={
        "Source Code": "https://github.com/bac-ta/microservices/",
    },
    classifiers=[
        "Development Status :: 3 - Alpha",
        "Topic :: Utilities",
        "License :: OSI Approved :: BSD License",
    ],
)
