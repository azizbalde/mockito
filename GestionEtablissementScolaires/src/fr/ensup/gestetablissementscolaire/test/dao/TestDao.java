package fr.ensup.gestetablissementscolaire.test.dao;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import fr.ensup.gestionetablissement.domaine.Etudiant;
import fr.ensup.gestionetablissementscolaires.dao.EtudiantDao;

public class TestDao {

//	Etudiant e;
//	@Before
//	public void init() {
//		e = mock(Etudiant.class);
//		when(e.getNomEtudiant()).thenReturn("nom");
//	}
//	
//	@Test
//	public void Test () {
//		assertEquals(e.getNomEtudiant(), "nom");
//	}
	
	EtudiantDao edao;
	Etudiant e;
	
	@Before
	public void init() {
		edao = mock(EtudiantDao.class);
		e = edao.creerEtudiant("i6", "lala", "ndiaye");
		when(edao.creerEtudiant("i6", "lala", "ndiaye")).thenReturn(e);
	}

	@Test
	public void Test() {
		assertEquals(e, edao.creerEtudiant("i6", "lala", "ndiaye"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
