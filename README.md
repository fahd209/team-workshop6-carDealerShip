# team-workshop6-carDealerShip

## Car inventory diagram
![invenotory Management Diagram](images/diagramSS.png)


## Contracts diagram
![cardealership project team](https://github.com/fahd209/team-workshop6-carDealerShip/assets/166452594/dde34423-f803-4af9-b9bb-90232f623335)

![fileManagerDiagramSS](images/fileManagerDiagramSS.png)

## Phase 1

We created those classes in the diagram, in intellij to have templates of the contract class, so we could make object off those classes as contracts either a sale or lease depeanding on what the user decides.


```java
public class Sales extends Contract
{
    private final double SALES_TAX;
    private final double RECORDING_FEE;
    private double processingFee;
    private boolean financed;

    public Sales(String date, String customerName, String customerEmail, boolean vehicleSold, double monthlyPayment, double salePrice, boolean financed)
    {
        super(date, customerName, customerEmail, vehicleSold, monthlyPayment, salePrice);
        this.SALES_TAX = salePrice * .05;
        this.RECORDING_FEE = 100;
        this.processingFee = salePrice < 10000 ? 295 : 495;
        this.financed = financed;
    }

    public double getSALES_TAX() {
        return SALES_TAX;
    }

    public double getRECORDING_FEE() {
        return RECORDING_FEE;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return financed;
    }

    public void setFinanced(boolean financed) {
        this.financed = financed;
    }

    @Override
    public double getTotalPrice()
    {
        return getSalePrice() + getSALES_TAX() + getRECORDING_FEE() + getProcessingFee();
    }

    @Override
    public double getMonthlyPayment()
    {
        double monthlyPayment = 0;

        if(isFinanced())
        {
            if(getTotalPrice() >= 10000)
            {
                monthlyPayment = 4.25 * (getTotalPrice() / 48);
            }
            else
            {
                monthlyPayment = 5.25 * (getTotalPrice() / 24);
            }
        }
        return monthlyPayment;
    }
}
```

