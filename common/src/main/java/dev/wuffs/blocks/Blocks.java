package dev.wuffs.blocks;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.wuffs.BambooEverything;
import dev.wuffs.blocks.block.*;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class Blocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BambooEverything.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<Block> BUNDLE = BLOCKS.register("bamboo_bundle", BambooBundleBlock::new);
    public static final RegistrySupplier<Block> DRY_BUNDLE = BLOCKS.register("dry_bamboo_bundle", BambooBundleBlock::new);
    public static final RegistrySupplier<Block> DOOR = BLOCKS.register("bamboo_door", BambooDoorBlock::new);
    public static final RegistrySupplier<Block> DRY_DOOR = BLOCKS.register("dry_bamboo_door", BambooDoorBlock::new);
    public static final RegistrySupplier<Block> FENCE = BLOCKS.register("bamboo_fence", BambooFenceBlock::new);
    public static final RegistrySupplier<Block> DRY_FENCE = BLOCKS.register("dry_bamboo_fence", BambooFenceBlock::new);
    public static final RegistrySupplier<Block> FENCEGATE = BLOCKS.register("bamboo_fence_gate", BambooFenceGateBlock::new);
    public static final RegistrySupplier<Block> DRY_FENCEGATE = BLOCKS.register("dry_bamboo_fence_gate", BambooFenceGateBlock::new);
    public static final RegistrySupplier<Block> LADDER = BLOCKS.register("bamboo_ladder", BambooLadderBlock::new);
    public static final RegistrySupplier<Block> DRY_LADDER = BLOCKS.register("dry_bamboo_ladder", BambooLadderBlock::new);
    public static final RegistrySupplier<Block> SLAB = BLOCKS.register("bamboo_slab", BambooSlabBlock::new);
    public static final RegistrySupplier<Block> DRY_SLAB = BLOCKS.register("dry_bamboo_slab", BambooSlabBlock::new);
    public static final RegistrySupplier<Block> STAIRS = BLOCKS.register("bamboo_stairs", BambooStairsBlock::new);
    public static final RegistrySupplier<Block> DRY_STAIRS = BLOCKS.register("dry_bamboo_stairs", BambooStairsBlock::new);
    public static final RegistrySupplier<Block> TRAPDOOR = BLOCKS.register("bamboo_trapdoor", BambooTrapDoorBlock::new);
    public static final RegistrySupplier<Block> DRY_TRAPDOOR = BLOCKS.register("dry_bamboo_trapdoor", BambooTrapDoorBlock::new);

}
