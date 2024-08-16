package ftl.payments

import ftl.builtin.Empty
import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="healthCheck",
  module="payments",
)
public interface HealthCheckClient :
    VerbClient<HttpRequest<Empty>, HttpResponse<HealthCheckResponse, in Any>> {
  public override fun call(`value`: HttpRequest<Empty>): HttpResponse<HealthCheckResponse, in Any>
}
