package bookentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookdetails")
public class BookDetails {

		@Id
	    private int id;
		private String name;
		private float price;
		private int quantity;
		private String authorname;
		public BookDetails(int id,String name,float price,int quantity,String authorname)
		{
			super();
			this.id=id;
			this.name=name;
			this.price=price;
			this.quantity=quantity;
			this.authorname=authorname;
		}
		public int getId()
		{
			return id;
		}
		public void setId(int id)
		{
			this.id=id;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public float getPrice()
		{
			return price;
		}
		public void setPrice(float price)
		{
			this.price=price;
		}
		public int getQuantity()
		{
			return quantity;
		}
		public String getauthorname()
		{
			return authorname;
		}
		public void setauthorname(String authorname)
		{
			this.authorname=authorname;
		}
		
	}


