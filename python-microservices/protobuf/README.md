## Install requirements.txt file for libs
- pip3 install -r requirements.txt

## Generate proto file to code: cd root project and run commandline:
- python -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. *.proto