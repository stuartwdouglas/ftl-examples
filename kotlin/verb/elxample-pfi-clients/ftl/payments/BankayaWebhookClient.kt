package ftl.payments

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import kotlin.String
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="bankayaWebhook",
  module="payments",
)
public interface BankayaWebhookClient :
    VerbClient<HttpRequest<BankayaWebhookRequest>, HttpResponse<String, in Any>> {
  public override fun call(`value`: HttpRequest<BankayaWebhookRequest>):
      HttpResponse<String, in Any>
}
