package com.emedinaa.circlerecyclerkotlin

import java.io.Serializable

//entidad  te obliga a poner variables
data class Noticia(val id:Int,val text:String, val image:Int,
                   val state:Boolean):Serializable

