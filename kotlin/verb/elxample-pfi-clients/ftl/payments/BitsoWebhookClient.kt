package ftl.payments

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.String
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="bitsoWebhook",
  module="payments",
)
public interface BitsoWebhookClient :
    VerbClient<HttpRequest<BitsoWebhookRequest>, HttpResponse<BitsoWebhookResponse, String>> {
  public override fun call(`value`: HttpRequest<BitsoWebhookRequest>):
      HttpResponse<BitsoWebhookResponse, String>
}
