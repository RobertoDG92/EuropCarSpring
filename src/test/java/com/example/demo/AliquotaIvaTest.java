package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.model.AliquotaIva;

public class AliquotaIvaTest {

	@Test
	public void nuovaAliquota() {
		AliquotaIva oaliquota = new AliquotaIva();
		oaliquota.setAliquota(2);
		oaliquota.setDescrizione("aliquota1");
		List<AliquotaIva> aliquote = new ArrayList<>();
		aliquote.add(oaliquota);
		assertNotNull(aliquote);
		assertEquals(2, aliquote.get(0).getAliquota());
		
	}
}
