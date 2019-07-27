package com.forgottenapothecary;

//R DZH SVIV
//HFMXLMFIV11
//HKRMLHZFIFH111
//MLGOVTZOGVMWVI
//OVHLERPP
//WZGFIZ
//GSILFTS GSVHV ORMVH R WL WVXIVV
//GSZG YB NVIVOB KFGGRMT NB MZNV RM
//NB RMUOFVMXV TILDH, ZMW GSFH, R YVXLNV RNNLIGZO
//XBYVIMVGRX DVY


//GL HLNV, R ZN YFG Z HSZWV
//YFG SVIV, R VCVIG KLDVI LEVI GSVN
//R NZWV Z XZHGOV SVIV LM GSRH SROO
//ZMW SZEV KFG NB UOZT RM GSV TILFMW
//GSRH RH NB MVD DLIOW


//HSLFOW GSV GIVHKZHHVIH LU GSV LOW DLIOW
//ZIIREV SVIV, YVZIRMT SLHGRORGRVH
//GSVB DROO YV NVG DRGS DIZGS

import com.forgottenapothecary.common.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings({"WeakerAccess", "unused"})
@Mod(modid = Forgottenapothecary.MODID, name = Forgottenapothecary.NAME, version = Forgottenapothecary.VERSION)
public class Forgottenapothecary {
	
	public static final String MODID = "forgottenapothecary", NAME = "Forgottenapothecary", VERSION = "0.0.1";
	
	public static final Logger logger = LogManager.getLogger(NAME);
	
	@Mod.Instance
	public static Forgottenapothecary instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger.info("I am inevitable.");
		logger.info("*snap*");
		ModItems.preInit();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("And I am Iron Man.");
		logger.info("*snap*");
	}
}