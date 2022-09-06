package com.jas.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class OutputNumberFloat {
	@NonNull
	private float resultFloat;
}
