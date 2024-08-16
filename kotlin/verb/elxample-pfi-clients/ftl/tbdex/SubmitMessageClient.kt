package ftl.tbdex

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="submitMessage",
  module="tbdex",
)
public interface SubmitMessageClient :
    VerbClient<HttpRequest<SubmitMessageRequestBody>, HttpResponse<in Any, TbdexError>> {
  public override fun call(`value`: HttpRequest<SubmitMessageRequestBody>):
      HttpResponse<in Any, TbdexError>
}
