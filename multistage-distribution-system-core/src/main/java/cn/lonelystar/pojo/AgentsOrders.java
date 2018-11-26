package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "agents_orders")
public class AgentsOrders implements Serializable {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "agent_id")
    private String agentId;

    private static final long serialVersionUID = 1L;

    /**
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * @return agent_id
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }
}