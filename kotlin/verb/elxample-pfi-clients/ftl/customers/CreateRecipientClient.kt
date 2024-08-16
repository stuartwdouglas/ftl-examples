package ftl.customers

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="createRecipient",
  module="customers",
)
public interface CreateRecipientClient : VerbClient<CreateRecipientRequest, CreateRecipientResponse>
    {
  public override fun call(`value`: CreateRecipientRequest): CreateRecipientResponse
}
