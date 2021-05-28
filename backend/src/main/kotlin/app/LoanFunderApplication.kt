package app

import app.bank.BankCSVTranslator
import app.covenant.CovenantCSVTranslator
import app.facility.FacilityCSVTranslator
import app.loan.LoanCSVTranslator
import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import com.github.doyaaaaaken.kotlincsv.dsl.csvWriter
import java.io.File

class LoanFunderApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bankFile = File("banks.csv")
            val banks = csvReader()
                .readAllWithHeader(bankFile)
                .map(BankCSVTranslator::translate)

            val facilityFile = File("facilities.csv")
            val facilities = csvReader()
                .readAllWithHeader(facilityFile)
                .map(FacilityCSVTranslator::translate)

            val covenantFile = File("covenants.csv")
            val covenants = csvReader()
                .readAllWithHeader(covenantFile)
                .map(CovenantCSVTranslator::translate)

            val loanFile = File("loans.csv")
            val loans = csvReader()
                .readAllWithHeader(loanFile)
                .map(LoanCSVTranslator::translate)

            println(banks)
            println(facilities)
            println(covenants)
            println(loans)
        }
    }
}