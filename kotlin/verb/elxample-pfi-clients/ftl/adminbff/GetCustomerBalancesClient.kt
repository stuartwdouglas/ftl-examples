package ftl.adminbff

import ftl.builtin.Empty
import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getCustomerBalances",
  module="adminbff",
)
public interface GetCustomerBalancesClient :
    VerbClient<HttpRequest<Empty>, HttpResponse<AdminGetCustomerBalancesResponse, in Any>> {
  public override fun call(`value`: HttpRequest<Empty>):
      HttpResponse<AdminGetCustomerBalancesResponse, in Any>
}
