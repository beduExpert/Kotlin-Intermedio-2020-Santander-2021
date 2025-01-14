package org.bedu.solucion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@Suppress("DEPRECATION")
class DetailActivity : AppCompatActivity() {

    companion object {
        val PRODUCT = "PRODUCT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val product = intent.getParcelableExtra<Product>(PRODUCT)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragment
        product?.let {
            detailFragment?.showProduct(product)
        }
    }



}