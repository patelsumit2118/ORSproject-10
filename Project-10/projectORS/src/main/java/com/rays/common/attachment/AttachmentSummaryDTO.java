package com.rays.common.attachment;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contains attached file information and data
 * @author Sumit Verma
 */

@Entity
@Table(name = "NCS_ATTACHMENT")
public class AttachmentSummaryDTO extends AttachmentBaseDTO {

}