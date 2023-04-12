import java.util.Date;

public class Aliments_Reserve extends Aliments_Stockable{
	
protected Integer Quantite;
	/**
	 * 
	 * @param ms
	 * @param dDP
	 * @param uDM
	 * @param nom
	 * @param quantite
	 */
	public Aliments_Reserve(MoyenDeStockage ms, Date dDP, UniteDeMesure uDM, String nom, Integer quantite) {
		super(ms, dDP, uDM, nom);
		this.Quantite = quantite;
	}
}
