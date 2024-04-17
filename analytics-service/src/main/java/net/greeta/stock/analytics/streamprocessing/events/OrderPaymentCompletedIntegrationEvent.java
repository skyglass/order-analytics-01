package net.greeta.stock.analytics.streamprocessing.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.greeta.stock.shared.eventhandling.IntegrationEvent;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OrderPaymentCompletedIntegrationEvent extends IntegrationEvent {
  private String orderId;
  private String status;
}
