package Ch_1_4_Analysis_Of_Algorithms;

public class Practise_1_4_42 {
	public static void main(String[] args) {
		/*
		 * T(N0) -> T0
		 * T(2N0) -> 2^bT0
		 * T(2^rN0) -> 2^rbT0
		 * 令 2^r * N0 = N 
		 * r = lg(N/N0)
		 * 
		 * T(N) -> 2^(lgN/N0 * b) * T0
		 * T(N) -> (N/N0)^b * T0
		 * 
		 *  对于规模为 N 的数据，需要 T = (N/N0)^b * T0 的时间才能处理完，
		 *  假如我们能接受的运行时间是 10 分钟
		 *  那么 T <= 600 
		 *  (N/N0)^b <= 600/T0
		 *  N/N0 <= logb(600/T0)
		 *  N <= N0 * logb(600/T0) 
		 *  
		 *  使用上题得到的测试数据如下
		 *  TwoSum : 规模 : 204800 用时 : 6.813850 倍率 : 3.995221
		 *  TwoSumFast : 规模 : 104857600 用时 : 4.807600 倍率 : 1.946279
		 *  ThreeSum : 规模 : 6400 用时 : 14.256600 倍率 : 7.954360
		 *  ThreeSumFast : 规模 : 25600 用时 : 17.622100 倍率 : 4.038478
		 *  
		 *  分别带入表达式得到 
		 *  
		 *  TwoSum : N <= 204800 * log2(600/6.813850) = 1323079.3732466278 ~ 一百三十万
		 *  TwoSumFast : b = 1，不符合对数定义 即 N <= 600 / 4.807600 * 104857600 ~ 13086479740.4110158915 ~ 一百三十亿
		 *  ThreeSum : N <= 6400 * log3(600/14.256600) = 21785.794964242 ~ 两万
		 *  ThreeSumFast : N <= 25600 * log2(600/17.622100) = 130291.3212732901 ~ 十三万
		 *  
		 *  对于 TwoSum : p = log2(N/1000) = log2(1323079.3732466278/1000) = 10.3697035252
		 *  对于 TwoSumFast : p = log2(N/1000) = log2(13086479740.4110158915/1000) = 23.6415737291
		 *  对于 ThreeSum : p = log2(N/1000) = log2(21785.794964242/1000) = 4.4453158531
		 *  对于 ThreeSumFast : p = log2(N/100) = log2(130291.3212732901/1000) = 7.0255971787
		 */
	}
}