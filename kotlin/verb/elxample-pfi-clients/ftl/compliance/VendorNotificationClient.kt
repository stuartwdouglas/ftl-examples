package ftl.compliance

import xyz.block.ftl.VerbClientDefinition
import xyz.block.ftl.VerbClientSink

@VerbClientDefinition(
  name="vendorNotification",
  module="compliance",
)
public interface VendorNotificationClient : VerbClientSink<VendorNotificationRequest> {
  override fun call(`value`: VendorNotificationRequest)
}
