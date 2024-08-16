package ftl.payments

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import kotlin.String
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="zbdWebhook",
  module="payments",
)
public interface ZbdWebhookClient :
    VerbClient<HttpRequest<ZbdWebhookRequest>, HttpResponse<String, in Any>> {
  public override fun call(`value`: HttpRequest<ZbdWebhookRequest>): HttpResponse<String, in Any>
}
