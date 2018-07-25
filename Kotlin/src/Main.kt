

fun main(args: Array<String>){
    var experimenter: Experimenter = Experimenter()
    /*
    // Problem 1
    var P1C1 : Array<Int> = intArrayOf(10, 15, 3, 7).toTypedArray()
    var P1C2 : Array<Int> = intArrayOf(38,16,94,40,79,78,74,75,61,73,23,13,1,52,89,27,48,86,73,100).toTypedArray()
    var P1C3 : Array<Int> = intArrayOf(5,2,28,22,17,4,32,100,97,53,37,59,78,88,55,45,95,25,67,72,69,40,34,33,51,8,56,80,21,35,54,64,90,39,47,25,7,84,89,89,22,18,23,35,87,73,74,33,92,22).toTypedArray()
    var P1C4 : Array<Int> = intArrayOf(371,231,632,676,880,179,895,699,322,344,120,953,81,500,535,846,757,963,192,845,330,393,736,389,490,776,400,733,882,454,8,99,403,7,865,622,84,759,675,51,394,946,215,764,492,561,971,869,735,771,160,841,738,497,63,883,379,880,317,621,809,998,231,142,751,756,808,74,630,44,32,760,736,583,579,554,214,985,27,255,974,246,403,148,492,976,855,799,948,108,38,454,950,257,762,134,291,523,758,343,766,815,317,330,778,116,811,130,259,227,92,848,781,498,527,960,319,811,24,789,998,551,591,822,270,27,51,817,392,310,493,947,788,912,525,917,364,390,925,201,241,188,675,215,302,109,249,240,154,675,282,498,693,1000,556,890,760,53,634,536,484,406,353,340,394,987,764,276,869,937,678,265,957,133,107,185,740,806,230,39,651,364,927,671,937,825,248,452,990,499,411,628,736,281,675,398,475,9,330,631,892,302,344,426,403,971,628,590,215,448,704,669,207,473,671,572,960,876,107,65,544,983,985,75,767,796,217,578,977,474,745,401,899,796,466,789,799,233,676,866,839,354,822,188,835,227,305,691,516,842).toTypedArray()

    val c1 = experimenter.RunExperiment(Problem1(P1C1, 17, true))
    val c2 = experimenter.RunExperiment(Problem1(P1C2, 50, true))
    val c3 = experimenter.RunExperiment(Problem1(P1C3, 150, true))
    val c4 = experimenter.RunExperiment(Problem1(P1C4, 500, true))
    */

    /*
    val c1 = experimenter.RunExperiment(Problem2(intArrayOf(1, 2, 3, 4, 5 ).toTypedArray(), intArrayOf(120, 60, 40, 30, 24).toTypedArray()))
    val c2 = experimenter.RunExperiment(Problem2(intArrayOf(3, 2, 1 ).toTypedArray(), intArrayOf(2, 3, 6).toTypedArray()))
    val c3 = experimenter.RunExperiment(Problem2(intArrayOf(1, 2, 4, 8, 16, 32, 64, 128 ).toTypedArray(), intArrayOf(268435456, 134217728, 67108864, 33554432, 16777216, 8388608, 4194304, 2097152).toTypedArray()))
    */

    val c1 = experimenter.RunExperiment(Problem3(intArrayOf(3, 4, -1, 1).toTypedArray(), 2))
    val c2 = experimenter.RunExperiment(Problem3(intArrayOf(1, 2, 0).toTypedArray(), 3))
    val c3 = experimenter.RunExperiment(Problem3(intArrayOf(1, 2, 4, 6, 8, 3, 5, 7, 9, 1, 1, 1, 3, 4, 2, 10).toTypedArray(), 11))
    val c4 = experimenter.RunExperiment(Problem3(intArrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 11, 12, 13, 14, 16).toTypedArray(), 15))



    val combined = arrayOf(c1,c2,c3, c4)
    experimenter.PrintIndi(combined)
    experimenter.PrintAverages(combined)

}