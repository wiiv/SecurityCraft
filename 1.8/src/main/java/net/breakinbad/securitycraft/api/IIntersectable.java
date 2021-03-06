package net.breakinbad.securitycraft.api;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

/**
 * This interface can be used to create Blocks that do something when
 * an Entity collides with the Block's bounding box. <p>
 * 
 * Return tileEntitySCTE.intersectsEntities() in createNewTileEntity() to
 * enable onEntityIntersected() to be called.
 * 
 * @author Geforce
 */
public interface IIntersectable extends ITileEntityProvider {
	
	/**
	 * Called when an Entity collides with a Block's bounding box.
	 */			
	public void onEntityIntersected(World world, BlockPos pos, Entity entity);

	public TileEntity createNewTileEntity(World worldIn, int meta);
}
