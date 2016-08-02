/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.SQLException;

/**
 *
 * @author martin
 */
public class Reaccion {

    private Base db;
    private Elemento[] elementos;
    private int cantAtoms;
    private int[] cant;
    private String nom;
    private String molecula;
    private Compuesto compuesto;

    public static final int HIDRURO_NOMETALICO = 0;
    public static final int HIDRURO_METALICO = 1;
    public static final int OXIDO_BASICO = 2;
    public static final int OXIDO_ACIDO = 3;
    public static final int HIDROXIDO = 4;
    public static final int ACIDO_OXACIDO = 5;
    public static final int ACIDO_HIDRACIDO = 6;
    public static final int SAL_HIDRACIDO = 7;
    public static final int SAL_NEUTRA = 8;
    public static final int SAL_ACIDA = 9;
    public static final int SAL_BASICA = 10;
    public static final int SAL_MIXTA = 11;
    public static final int PEROXIDOS = 12;

    /**
     *
     * @param db base de datos
     * @param elementos Array de elementos
     * @param cantAtoms Cantidad de atomos
     * @param tipo usar alguno de los final
     */
    public Reaccion(Base db, Elemento[] elementos, int tipo) {
        this.db = db;
        this.elementos = elementos;
        this.cantAtoms = cantAtoms;
        if (tipo == Reaccion.HIDRURO_NOMETALICO) {
            this.compuesto = this.hidruro_nometalico(elementos);
        } else if (tipo == Reaccion.HIDRURO_METALICO) {
            this.compuesto = this.hidruro_metalico(elementos);
        }
    }

    public Compuesto getCompuesto() {
        return compuesto;
    }

    private Compuesto hidruro_nometalico(Elemento[] ele) {
        Compuesto hnm = null;
        try {
            Elemento h = new Elemento(1, 
                                      this.db.getElementNameNM(0), 
                                      this.db.getElementNomNM(0), 
                                      this.db.getElementStatesArrayNM(0), 
                                      this.db.getElementStatesArrayNM(0)[1], 
                                      this.db.getElementElenegNM(0));
            Elemento[] arr = {ele[0], h};
            int[] cant = new int[2];
            String nom = null;
            for (int i = 1; i <= ele[0].getEstado_used(); i++) {
                for (int a = 1; a <= ele[0].getEstado_used(); i++) {
                    if ((ele[0].getEstado_used() * i) - (h.getEstado_used() * a) == 0) {
                        cant[0] = i;
                        cant[1] = a;
                        System.out.println("funco " + i + a);
                        break;
                    }
                }
            }
            if (cant[0] == 1) {
                nom = ele[0].getNom() + h.getNom() + cant[1];
            } else if (cant[1] == 1) {
                nom = ele[0].getNom() + cant[0] + h.getNom();
            } else if (cant[0] == 1 && cant[1] == 1) {
                nom = ele[0].getNom() + h.getNom();
            } else {
                nom = ele[0].getNom() + cant[0] + h.getNom() + cant[1];
            }
            nom = ele[0].getNom() + cant[0] + h.getNom() + cant[1];
            hnm = new Compuesto(arr, arr.length, cant, "sha cazi", nom, Reaccion.HIDRURO_NOMETALICO);
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return hnm;
    }

    private Compuesto hidruro_metalico(Elemento[] ele) {
        Compuesto hm = null;
        try {
            Elemento h = new Elemento(1, 
                                      this.db.getElementNameNM(0), 
                                      this.db.getElementNomNM(0), 
                                      this.db.getElementStatesArrayNM(0), 
                                      this.db.getElementStatesArrayNM(0)[0], 
                                      this.db.getElementElenegNM(0));
            Elemento[] arr = {h, ele[0]};
            int[] cant = new int[2];
            String nom = null;
            for (int i = 1; i <= ele[0].getEstado_used(); i++) {
                for (int a = 1; a <= ele[0].getEstado_used(); i++) {
                    if ((ele[0].getEstado_used() * a) - (h.getEstado_used() * i) == 0) {
                        cant[0] = i;
                        cant[1] = a;
                        break;
                    }
                }
            }
            if (cant[0] == 1 && cant[1] == 1) {
                nom = h.getNom() + ele[0].getNom();
            }else if (cant[0] == 1) {
                nom = ele[0].getNom() + h.getNom() + cant[1];
            } else if (cant[1] == 1) {
                nom = ele[0].getNom() + cant[0] + h.getNom();
            } else {
                nom = h.getNom() + cant[1] + ele[0].getNom() + cant[0];
            }
            System.out.println(nom);
            hm = new Compuesto(arr, arr.length, cant, "sha cazi", nom, Reaccion.HIDRURO_METALICO);
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return hm;
    }
    /*
    private Compuesto oxido_basico(Elemento[] ele) {

    }

    private Compuesto oxido_acido(Elemento[] ele) {

    }

    private Compuesto hidroxido(Elemento[] ele) {

    }

    private Compuesto acido_oxacido(Elemento[] ele) {

    }

    private Compuesto acido_hidracido(Elemento[] ele) {

    }

    private Compuesto sal_hidracida(Compuesto hidracido, Compuesto hidroxido) {

    }

    private Compuesto sal_neutra(Compuesto oxoacido, Compuesto hidroxido) {

    }

    private Compuesto sal_acida(Compuesto oxoacido, Compuesto hidroxido) {

    }

    private Compuesto sal_basica(Compuesto oxoacido, Compuesto hidroxido) {

    }

    private Compuesto sal_mixta(Compuesto oxoacido, Compuesto hidroxido1, Compuesto hidroxido2) {
        
    }
     */
}
