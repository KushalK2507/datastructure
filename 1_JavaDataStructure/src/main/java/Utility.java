import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utility {

    public static void main (String[] args){

//        int n=3;
//        System.out.println(n/2);
//
//        for (int i=0;i<n/2;i++){
//            System.out.println(i);
//
//            int[] arr = new int[0];
//            System.out.println("Length"+arr.length);
//
//        }
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//
//
//        System.out.println(numbers.indexOf(1));


        var contracts = List.of("3D41C800D22D5C63F93A"," 8F081D4B198127C581AA"," C8E082E352C587669EFA"," 44FE6D5B5420327D64FA"," CEB8F24A14DC87143D8A"," 226A4CA31D7C4B8AB71A"," 61A202F860685A9C1BCA"," 89B8E5394C6E03D3680A"," 144CD8FD68BCC72E997A"," 833D5EC3760C2C5D063A"," F19257B2353BD69421DA"," C9704DAC26D80522369A"," 6333841C1765ED3DC1AA"," CCD8C10E801FD795291A"," B0DEC1109584629911DA"," E283A9E439C93F5C4C6A"," 8FDF1FF7CFDA0CE73E0A"," 44682D010F1C9A5F913A"," 00C1267EC99779A8B26A"," A6B1FB01C135B35DFDBA"," 1BC714353FA72E5FED0A"," 878D9E3086469B216BEA"," C693B57985B2CE5C982A"," 5E62E460D83353FA079A"," AC2DD7CDC002BEC3F61A"," 4DEBE6F573A734F94DAA"," BF3207640E12C0F253AA"," 6A069B355237DDF5D22A"," 118554C20E3AF9A8F80A"," 305EFF4F0CFD68A71B3A"," 6933D828CBD414D6732A"," C4C3392880C6DF891F5A"," CD8288C387248B2DEBBA"," 200077F6842411DE70BA"," 3780DD57FCCB5232E67A"," EA9D766CBC7C8E725F3A"," CC5710CFF2355EE8A25A"," FCE93CFE99F0330E83FA"," CAA03D0BEA652EBA6E1A"," DC02A847666A93637FEA"," 76B6816A334AEFCBB79A"," 0C3BF317C8F54B7078AA"," 2F02DD73469BF882650A"," 7619237DCE5EE6CD245A"," A73760861F039224498A"," C98793E0001EBFC58B1A"," 15FDEE74D36DCF3083AA"," 8622442D32CE79A023CA"," 0E58E02023C828D4A4EA"," B290F8303E1B33455E4A"," 620D97478C0E50B6709A"," E04990F159E45369B34A"," 9E6132AF4AC7AB64A88A"," 8DFB60ECDCE93BEEAFCA"," E5F0ED343CFFD365B9EA"," B6B35AAFA12E4BCFD5BA"," 2E5ED019124702BC651A"," 34BDD91FFE0A34680BFA"," C5B46923B2C20D4CB75A"," 2D2F004CC3C058EE57EA"," C5AAD5E63A3B04CC48DA"," 71CDDB897A706DFCD57A"," 22D8E8C30456E219F6BA"," 6E45BCD1D0BDF2B6577A"," 1FF5DB45886CF846EBDA"," 6439875CF5A761826DEA"," 7436595B415F7147594A"," A90B3ECB2EA50F4AF33A"," 635AB9B3B812266D980A"," 9760D3356A63170D9A6A"," C02E657964D8D35D3F0A"," 8F02717B876DCEF144CA"," C86DD4C43D702ABB653A"," FCA907F40AA87BB12BCA"," B2596E863F554C0E384A"," F7AB7839D48621A5B92A"," 5765A4AAEB587497197A"," 3942ACFEA053E9C819EA"," C27C114C6D845C8AE63A"," EF59D9797730736FBE1A"," 551F8F55A3ED8392EE2A"," D593F9EF880B5CEA959A"," 619BA93F5EB52FB0ACDA"," 74F4C5853DE9B4E9B9CA"," 387E5883876BB4272A5A"," 1E7E8C5F28BF1281D2AA"," 00C27AC4281E49D7DCBA"," A39021AF3A4D372C715A"," 2177F6A22A927530CB7A"," 5026B874F383D435E09A");

        System.out.println(contracts.size());

        var contractSet = Set.of("3D41C800D22D5C63F93A"," 8F081D4B198127C581AA"," C8E082E352C587669EFA"," 44FE6D5B5420327D64FA"," CEB8F24A14DC87143D8A"," 226A4CA31D7C4B8AB71A"," 61A202F860685A9C1BCA"," 89B8E5394C6E03D3680A"," 144CD8FD68BCC72E997A"," 833D5EC3760C2C5D063A"," F19257B2353BD69421DA"," C9704DAC26D80522369A"," 6333841C1765ED3DC1AA"," CCD8C10E801FD795291A"," B0DEC1109584629911DA"," E283A9E439C93F5C4C6A"," 8FDF1FF7CFDA0CE73E0A"," 44682D010F1C9A5F913A"," 00C1267EC99779A8B26A"," A6B1FB01C135B35DFDBA"," 1BC714353FA72E5FED0A"," 878D9E3086469B216BEA"," C693B57985B2CE5C982A"," 5E62E460D83353FA079A"," AC2DD7CDC002BEC3F61A"," 4DEBE6F573A734F94DAA"," BF3207640E12C0F253AA"," 6A069B355237DDF5D22A"," 118554C20E3AF9A8F80A"," 305EFF4F0CFD68A71B3A"," 6933D828CBD414D6732A"," C4C3392880C6DF891F5A"," CD8288C387248B2DEBBA"," 200077F6842411DE70BA"," 3780DD57FCCB5232E67A"," EA9D766CBC7C8E725F3A"," CC5710CFF2355EE8A25A"," FCE93CFE99F0330E83FA"," CAA03D0BEA652EBA6E1A"," DC02A847666A93637FEA"," 76B6816A334AEFCBB79A"," 0C3BF317C8F54B7078AA"," 2F02DD73469BF882650A"," 7619237DCE5EE6CD245A"," A73760861F039224498A"," C98793E0001EBFC58B1A"," 15FDEE74D36DCF3083AA"," 8622442D32CE79A023CA"," 0E58E02023C828D4A4EA"," B290F8303E1B33455E4A"," 620D97478C0E50B6709A"," E04990F159E45369B34A"," 9E6132AF4AC7AB64A88A"," 8DFB60ECDCE93BEEAFCA"," E5F0ED343CFFD365B9EA"," B6B35AAFA12E4BCFD5BA"," 2E5ED019124702BC651A"," 34BDD91FFE0A34680BFA"," C5B46923B2C20D4CB75A"," 2D2F004CC3C058EE57EA"," C5AAD5E63A3B04CC48DA"," 71CDDB897A706DFCD57A"," 22D8E8C30456E219F6BA"," 6E45BCD1D0BDF2B6577A"," 1FF5DB45886CF846EBDA"," 6439875CF5A761826DEA"," 7436595B415F7147594A"," A90B3ECB2EA50F4AF33A"," 635AB9B3B812266D980A"," 9760D3356A63170D9A6A"," C02E657964D8D35D3F0A"," 8F02717B876DCEF144CA"," C86DD4C43D702ABB653A"," FCA907F40AA87BB12BCA"," B2596E863F554C0E384A"," F7AB7839D48621A5B92A"," 5765A4AAEB587497197A"," 3942ACFEA053E9C819EA"," C27C114C6D845C8AE63A"," EF59D9797730736FBE1A"," 551F8F55A3ED8392EE2A"," D593F9EF880B5CEA959A"," 619BA93F5EB52FB0ACDA"," 74F4C5853DE9B4E9B9CA"," 387E5883876BB4272A5A"," 1E7E8C5F28BF1281D2AA"," 00C27AC4281E49D7DCBA"," A39021AF3A4D372C715A"," 2177F6A22A927530CB7A"," 5026B874F383D435E09A");

        System.out.println(contractSet.size());


    }
}
