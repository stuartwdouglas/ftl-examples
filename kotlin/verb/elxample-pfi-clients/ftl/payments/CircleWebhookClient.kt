package ftl.payments

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import kotlin.ByteArray
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="circleWebhook",
  module="payments",
)
public interface CircleWebhookClient :
    VerbClient<HttpRequest<SnsMessage>, HttpResponse<ByteArray, in Any>> {
  public override fun call(`value`: HttpRequest<SnsMessage>): HttpResponse<ByteArray, in Any>
}
