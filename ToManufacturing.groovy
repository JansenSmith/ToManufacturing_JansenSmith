// Make a cube and put it up in the air
CSG cubeInTheAir = new Cube(10).toCSG()
				.movez(30)
				.rotx(15)// rotate so it would not print well
cubeInTheAir.setName("CubeInTheAir")
cubeInTheAir.addExportFormat("stl")// make an stl of the object
cubeInTheAir.addExportFormat("svg")// make an svg of the object
cubeInTheAir.setManufacturing({ toMfg ->
	return toMfg
			.rotx(-15)// fix the orentation
			.toZMin()//move it down to the flat surface
})				
