package ftl.customers

import java.time.ZonedDateTime
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CreateRecipientRequest",
  module="customers",
)
public data class CreateRecipientRequest(
  public val name: String,
  public val dob: ZonedDateTime,
  public val country: String,
  public val territory: String,
  public val phone: String,
)
