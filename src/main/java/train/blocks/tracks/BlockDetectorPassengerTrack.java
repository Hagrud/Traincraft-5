/**
 * A track that detects all instance of IPassenger
 * 
 * @author Spitfire4466
 */
package train.blocks.tracks;

import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.library.Tracks;

public class BlockDetectorPassengerTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.DETECTOR_PASSENGER;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof GenericRailTransport
				&& ((GenericRailTransport) cart).getTypes().contains(TrainsInMotion.transportTypes.PASSENGER)) {
			setTrackPowering();
		}
	}
}
