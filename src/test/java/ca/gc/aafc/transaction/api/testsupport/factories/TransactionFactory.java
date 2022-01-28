package ca.gc.aafc.transaction.api.testsupport.factories;

import ca.gc.aafc.dina.testsupport.factories.TestableEntityFactory;
import ca.gc.aafc.transaction.api.entities.Transaction;

public class TransactionFactory implements TestableEntityFactory<Transaction> {

  @Override
  public Transaction getEntityInstance() {
    return newTransaction().build();
  }

  public static Transaction.TransactionBuilder newTransaction() {
    return Transaction.
        builder()
        .transactionNumber(TestableEntityFactory.generateRandomNameLettersOnly(12));
  }

}
