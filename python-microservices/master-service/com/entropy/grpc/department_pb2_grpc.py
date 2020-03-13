# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import com.entropy.grpc.department_pb2 as department__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class DepartmentServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.find_departments = channel.unary_unary(
        '/department.DepartmentService/find_departments',
        request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
        response_deserializer=department__pb2.DepartmentResponses.FromString,
        )
    self.find_department_by_id = channel.unary_unary(
        '/department.DepartmentService/find_department_by_id',
        request_serializer=department__pb2.DepartmentIdRequest.SerializeToString,
        response_deserializer=department__pb2.Department.FromString,
        )
    self.save_department = channel.unary_unary(
        '/department.DepartmentService/save_department',
        request_serializer=department__pb2.DepartmentSaving.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.remove_department_by_id = channel.unary_unary(
        '/department.DepartmentService/remove_department_by_id',
        request_serializer=department__pb2.DepartmentIdRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )


class DepartmentServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def find_departments(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def find_department_by_id(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def save_department(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def remove_department_by_id(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_DepartmentServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'find_departments': grpc.unary_unary_rpc_method_handler(
          servicer.find_departments,
          request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
          response_serializer=department__pb2.DepartmentResponses.SerializeToString,
      ),
      'find_department_by_id': grpc.unary_unary_rpc_method_handler(
          servicer.find_department_by_id,
          request_deserializer=department__pb2.DepartmentIdRequest.FromString,
          response_serializer=department__pb2.Department.SerializeToString,
      ),
      'save_department': grpc.unary_unary_rpc_method_handler(
          servicer.save_department,
          request_deserializer=department__pb2.DepartmentSaving.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'remove_department_by_id': grpc.unary_unary_rpc_method_handler(
          servicer.remove_department_by_id,
          request_deserializer=department__pb2.DepartmentIdRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'department.DepartmentService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
