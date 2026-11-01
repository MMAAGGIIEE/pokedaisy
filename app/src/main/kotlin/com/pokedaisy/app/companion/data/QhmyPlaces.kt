package com.pokedaisy.app.companion.data

/** 漆黑的魅影沿用绿宝石的地图区块编号；显示层换成简体中文地名。 */
internal val mapSecDataQhmy: Map<Int, MapSecInfo> by lazy {
    mapSecDataEmerald.mapValues { (_, v) -> v.copy(name = qhmyPlaceName(v.name)) }
}

private val ROUTE = Regex("Route (\\d+)")
private val SEVII = Regex("Sevii Isle (\\d+)")

private fun qhmyPlaceName(en: String): String {
    ROUTE.matchEntire(en)?.let { return "${it.groupValues[1]}号道路" }
    SEVII.matchEntire(en)?.let { return "七之岛${it.groupValues[1]}号区域" }
    return QHMY_PLACES[en] ?: en
}

private val QHMY_PLACES = mapOf(
    "Littleroot Town" to "未白镇", "Oldale Town" to "古辰镇", "Dewford Town" to "武斗镇",
    "Lavaridge Town" to "釜炎镇", "Fallarbor Town" to "秋叶镇", "Verdanturf Town" to "绿荫镇",
    "Pacifidlog Town" to "暮水镇", "Petalburg City" to "橙华市", "Slateport City" to "凯那市",
    "Mauville City" to "紫堇市", "Rustboro City" to "卡那兹市", "Fortree City" to "茵郁市",
    "Lilycove City" to "水静市", "Mossdeep City" to "绿岭市", "Sootopolis City" to "琉璃市",
    "Ever Grande City" to "彩幽市", "Abandoned Ship" to "废弃船", "Altering Cave" to "变化洞窟",
    "Ancient Tomb" to "古代坟墓", "Aqua Hideout" to "海洋队基地", "{aqua} Hideout" to "海洋队基地",
    "Artisan Cave" to "工匠洞窟", "Battle Frontier" to "对战开拓区", "Berry Forest" to "树果森林",
    "Birth Island" to "诞生之岛", "Bond Bridge" to "羁绊桥", "Canyon Entrance" to "峡谷入口",
    "Cape Brink" to "阿斯卡纳海角", "Cave OF Origin" to "觉醒祠堂", "Celadon City" to "玉虹市",
    "Cerulean Cave" to "华蓝洞窟", "Cerulean City" to "华蓝市", "Cinnabar Island" to "红莲岛",
    "Desert Ruins" to "沙漠遗迹", "Desert Underpass" to "沙漠地下通道", "Diglett's Cave" to "地鼠洞穴",
    "Dilford Chamber" to "迪福特石室", "Dotted Hole" to "点之穴", "Dynamic" to "动态区域",
    "Ember Spa" to "灯火温泉", "Faraway Island" to "边境小岛", "Fiery Path" to "热焰小径",
    "Five Island" to "五之岛", "Five Isle Meadow" to "五岛草原", "Four Island" to "四之岛",
    "Fuchsia City" to "浅红市", "Granite Cave" to "石之洞窟", "Green Path" to "绿色小径",
    "Icefall Cave" to "冰瀑洞窟", "Indigo Plateau" to "石英高原", "Inside OF Truck" to "卡车内部",
    "Island Cave" to "小岛洞窟", "Jagged Pass" to "凹凸山道", "Kindle Road" to "灯火山路",
    "Lavender Town" to "紫苑镇", "Liptoo Chamber" to "利普托石室", "Lost Cave" to "迷失洞窟",
    "Magma Hideout" to "熔岩队基地", "Marine Cave" to "海洋洞窟", "Memorial Pillar" to "纪念柱",
    "Meteor Falls" to "流星瀑布", "Mirage Island" to "幻之岛", "Mirage Tower" to "幻影之塔",
    "Monean Chamber" to "莫尼安石室", "Mt. Chimney" to "烟囱山", "Mt. Ember" to "灯火山",
    "Mt. Moon" to "月见山", "Mt. Pyre" to "送神火山", "Navel Rock" to "肚脐岩",
    "New Mauville" to "新紫堇", "One Island" to "一之岛", "Outcast Island" to "外岛",
    "Pallet Town" to "真新镇", "Pattern Bush" to "记号森林", "Petalburg Woods" to "橙华森林",
    "Pewter City" to "深灰市", "Pokémon League" to "宝可梦联盟", "Pokémon Mansion" to "宝可梦大宅",
    "Pokémon Tower" to "宝可梦塔", "Power Plant" to "无人发电厂", "Resort Gorgeous" to "豪华度假区",
    "Rixy Chamber" to "里克西石室", "Rock Tunnel" to "岩山隧道", "Rocket Hideout" to "火箭队基地",
    "Rocket Warehouse" to "火箭队仓库", "Ruin Valley" to "遗迹山谷", "Rusturf Tunnel" to "卡绿隧道",
    "S.s. Anne" to "圣特安努号", "Safari Zone" to "狩猎地带", "Saffron City" to "金黄市",
    "Scorched Slab" to "炎热小穴", "Scufib Chamber" to "斯库菲石室", "Seafloor Cavern" to "海底洞窟",
    "Seafoam Islands" to "双子岛", "Sealed Chamber" to "布告石室", "Secret Base" to "秘密基地",
    "Sevault Canyon" to "七宝溪谷", "Seven Island" to "七之岛", "Shoal Cave" to "浅滩洞窟",
    "Silph Co." to "西尔佛公司", "Six Island" to "六之岛", "Sky Pillar" to "天空之柱",
    "Southern Island" to "南方孤岛", "Special Area" to "特殊区域", "Tanoby Chambers" to "阿斯卡纳石室",
    "Tanoby Key" to "阿斯卡纳钥匙", "Tanoby Ruins" to "阿斯卡纳遗迹", "Terra Cave" to "陆地洞窟",
    "Three Island" to "三之岛", "Three Isle Path" to "三岛小径", "Three Isle Port" to "三岛港口",
    "Trainer Hill" to "训练家之丘", "Trainer Tower" to "训练家之塔", "Treasure Beach" to "宝藏海滩",
    "Two Island" to "二之岛", "Underground Path" to "地下通道", "Underwater" to "水下",
    "Vermilion City" to "枯叶市", "Viapois Chamber" to "维亚波伊斯石室", "Victory Road" to "冠军之路",
    "Viridian City" to "常青市", "Viridian Forest" to "常青森林", "Water Labyrinth" to "水上迷宫",
    "Water Path" to "水路", "Weepth Chamber" to "威普斯石室",
)
