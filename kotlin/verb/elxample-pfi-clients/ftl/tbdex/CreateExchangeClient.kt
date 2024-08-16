package ftl.tbdex

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="createExchange",
  module="tbdex",
)
public interface CreateExchangeClient :
    VerbClient<HttpRequest<CreateExchangeRequestBody>, HttpResponse<in Any, TbdexError>> {
  public override fun call(`value`: HttpRequest<CreateExchangeRequestBody>):
      HttpResponse<in Any, TbdexError>
}
