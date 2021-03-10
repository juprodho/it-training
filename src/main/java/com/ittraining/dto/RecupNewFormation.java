package com.ittraining.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *DTO pour l'objet formation
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecupNewFormation {
	
	private Long formationId;
	private String titre;
	private String description;

}
