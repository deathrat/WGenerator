package net.buddat.wgenerator.util;

/**
 * @author Budda
 *
 * Class containing all default settings for a new map generation.
 */
public class Constants {
	
	public static final String WINDOW_TITLE = "WGenerator - Map Generator for Wurm Unlimited";
	public static final int WINDOW_SIZE = 768;
	
	public static final int MAP_SIZE = 2048;
	public static final float MAP_HEIGHT = 4096f;
	
	public static final float SINGLE_DIRT = 1.0f / MAP_HEIGHT;
	
	public static final double RESOLUTION = MAP_SIZE / 8;
	
	public static final int HEIGHTMAP_ITERATIONS = 10;

	public static final int EROSION_MIN_SLOPE = 30;
	public static final int EROSION_MAX_SLOPE = 300;
	public static final int EROSION_MAX_SEDIMENT = 100;
	
	public static final int DIRT_DROP_COUNT = 40;
	public static final int MAX_DIRT_SLOPE = 40;
	public static final int MAX_DIRT_DIAG_SLOPE = 56;
	public static final int WATER_HEIGHT = 500;
	public static final int CLIFF_RATIO = 1;
	
	public static final int EROSION_ITERATIONS = 30;
	public static final int ROCK_WEIGHT = 3800;
	
	public static final int GRASS_ITERATIONS = 50;
	public static final int BIOME_RATE = 60;
	public static final int BIOME_MAX_SLOPE = 20;
	public static final int BIOME_SEEDS = 500;
	public static final int BIOME_SIZE = 60;
	public static final int BIOME_DENSITY = 1;
	public static final int BIOME_MIN_HEIGHT = 50;
	public static final int BIOME_MAX_HEIGHT = 50;
	public static final int BIOME_RANDOM_MIN = 50;
	public static final int BIOME_RANDOM_MAX = 75;
	
	public static final double ORE_IRON = 1.0, ORE_GOLD = 0.05, ORE_SILVER = 0.1, ORE_ZINC = 0.15, 
			ORE_COPPER = 0.2, ORE_LEAD = 0.2, ORE_TIN = 0.2, ORE_ADDY = 0.0, ORE_GLIMMER = 0.0, ORE_MARBLE = 0.2, ORE_SLATE = 0.2;
	
	public static final float NORMAL_LOW = 0.5f;
	public static final float NORMAL_HIGH = 1.0f - NORMAL_LOW;
	
	public static final int MIN_EDGE = 64;
	public static final double BORDER_WEIGHT = 6.0;
	public static final boolean MORE_LAND = true;
	
	public static final int GRID_SIZE = 8;
	
}
