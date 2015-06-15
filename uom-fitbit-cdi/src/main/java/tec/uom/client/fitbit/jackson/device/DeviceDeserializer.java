package tec.uom.client.fitbit.jackson.device;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.device.Device;
import tec.uom.client.fitbit.model.device.DeviceType;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class DeviceDeserializer extends JsonDeserializer<Device> {

	@Override
	public Device deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		Device device = new Device(data.get("id").asText(),
				DeviceType.valueOf(data.get("type").asText()), data.get(
						"battery").asText(), Quantities.getQuantity(
						data.get("lastSyncTime").numberValue(), SI.MINUTE),
				data.get("deviceVersion").asText());
		return device;
	}
}
