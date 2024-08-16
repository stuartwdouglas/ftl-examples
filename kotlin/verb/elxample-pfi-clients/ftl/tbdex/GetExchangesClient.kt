package ftl.tbdex

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getExchanges",
  module="tbdex",
)
public interface GetExchangesClient :
    VerbClient<HttpRequest<GetExchangesRequestBody>, HttpResponse<GetExchangesResponseBody, TbdexError>>
    {
  public override fun call(`value`: HttpRequest<GetExchangesRequestBody>):
      HttpResponse<GetExchangesResponseBody, TbdexError>
}
