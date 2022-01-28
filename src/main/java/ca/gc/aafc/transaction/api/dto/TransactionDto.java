package ca.gc.aafc.transaction.api.dto;

import ca.gc.aafc.dina.dto.RelatedEntity;
import ca.gc.aafc.dina.repository.meta.AttributeMetaInfoProvider;
import ca.gc.aafc.transaction.api.entities.Transaction;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;
import org.javers.core.metamodel.annotation.Id;
import org.javers.core.metamodel.annotation.PropertyName;
import org.javers.core.metamodel.annotation.TypeName;

import java.time.OffsetDateTime;
import java.util.UUID;

@RelatedEntity(Transaction.class)
@Data
@JsonApiResource(type = TransactionDto.TYPENAME)
@TypeName(TransactionDto.TYPENAME)
public class TransactionDto extends AttributeMetaInfoProvider {

  public static final String TYPENAME = "transaction";

  @JsonApiId
  @Id
  @PropertyName("id")
  private UUID uuid;

  private String transactionNumber;

  private String createdBy;
  private OffsetDateTime createdOn;

}
