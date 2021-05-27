package APCS_2009;
import java.util.ArrayList;
public class TileGameMain {
	public static void main(String[] args)
	{
		ArrayList<NumberTile> tiles = new ArrayList<NumberTile>();
		tiles.add(new NumberTile(4,3,7,4));
		tiles.add(new NumberTile(6,4,3,3));
		tiles.add(new NumberTile(1,2,3,4));
		tiles.add(new NumberTile(3,2,5,2));
		tiles.add(new NumberTile(5,9,2,2));
		TileGame game1 = new TileGame(tiles);
		System.out.println(game1);
		System.out.println(game1.insertTile(new NumberTile(4,2,9,2)));
		System.out.println(game1.insertTile(new NumberTile(4,2,9,8)));
		System.out.println(game1);
	}
}
