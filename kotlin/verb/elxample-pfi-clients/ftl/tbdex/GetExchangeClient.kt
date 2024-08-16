package ftl.tbdex

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getExchange",
  module="tbdex",
)
public interface GetExchangeClient :
    VerbClient<HttpRequest<GetExchangeRequestBody>, HttpResponse<GetExchangeResponseBody, TbdexError>>
    {
  public override fun call(`value`: HttpRequest<GetExchangeRequestBody>):
      HttpResponse<GetExchangeResponseBody, TbdexError>
}
