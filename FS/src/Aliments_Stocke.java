import java.util.Date;

public class Aliments_Stocke extends Aliments_Stockable{

	protected Integer Quantite;
	
	public Aliments_Stocke(MoyenDeStockage ms, Date dDP, UniteDeMesure uDM, String nom, Integer quantite) {
		super(ms, dDP, uDM, nom);
		this.Quantite = quantite;
	}
}
