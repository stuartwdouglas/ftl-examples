package ftl.kcc

import kotlin.String
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CredentialConfigurationSupported",
  module="kcc",
)
public data class CredentialConfigurationSupported(
  public val format: String,
  public val cryptoBindingMethodsSupported: List<String>,
  public val cryptoSigningAlgsSupported: List<String>,
  public val proofTypesSupported: ProofTypeSupported,
)
