package ftl.payments

import Retention
import xyz.block.ftl.Subscription

/**
 * Subscription to the topic of type {@link $L}
 */
@Retention(AnnotationRetention.RUNTIME)
@Subscription(
  topic="transaction_events",
  module="payments",
  name="transaction_eventsSubscription",
)
public annotation class Transaction_eventsSubscription
