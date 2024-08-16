package ftl.payments

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import kotlin.String
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="squareWebhook",
  module="payments",
)
public interface SquareWebhookClient :
    VerbClient<HttpRequest<WebhookNotification>, HttpResponse<String, in Any>> {
  public override fun call(`value`: HttpRequest<WebhookNotification>): HttpResponse<String, in Any>
}
