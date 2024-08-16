package ftl.tbdex

import ftl.builtin.Empty
import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getBalances",
  module="tbdex",
)
public interface GetBalancesClient :
    VerbClient<HttpRequest<Empty>, HttpResponse<GetBalancesResponseBody, TbdexError>> {
  public override fun call(`value`: HttpRequest<Empty>):
      HttpResponse<GetBalancesResponseBody, TbdexError>
}
