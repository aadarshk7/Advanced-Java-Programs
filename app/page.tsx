import Image from "next/image"
import { Badge } from "@/components/ui/badge"
import { Facebook, Instagram, Youtube } from "lucide-react"
import TikTokIcon from "@/components/tiktok-icon"
import { Facebook, Instagram, Youtube, Phone } from 'lucide-react';


export default function PizzaMenu() {
  const pizzas = [
    {
      id: 1,
      name: "Veg Pizza Small (1 Person)",
      description: "Classic vegetarian pizza topped with fresh tomatoes, mozzarella, and basil.",
      originalPrice: 250,
      currentPrice: 149,
          image: "https://png.pngtree.com/png-clipart/20250221/original/pngtree-veggie-pizza-white-background-1-png-image_20491164.png?height=200&width=200",

    },
    {
      id: 2,
      name: "Veg Pizza Medium (2-3 People)",
      description: "Medium-sized pizza loaded with bell peppers, onions, olives, and extra cheese.",
      originalPrice: 249,
      currentPrice: 189,
          image: "https://png.pngtree.com/png-clipart/20250221/original/pngtree-veggie-pizza-white-background-1-png-image_20491164.png?height=200&width=200"

      ,
    },
    {
      id: 3,
      name: "Veg Pizza Large (Family)",
      description: "Family-sized pizza with mushrooms, capsicum, sweet corn, and black olives.",
      originalPrice: 229,
      currentPrice: 179,
          image: "https://png.pngtree.com/png-clipart/20250221/original/pngtree-veggie-pizza-white-background-1-png-image_20491164.png?height=200&width=200"

      ,
    },
    {
      id: 4,
      name: "Chicken Pizza Small (1 Person)",
      description: "Tender grilled chicken, mozzarella cheese, and BBQ sauce on a crispy base.",
      originalPrice: 259,
      currentPrice: 199,
          image: "https://i.pinimg.com/736x/ec/1f/d3/ec1fd366a2a14042715fefeb346f5814.jpg?height=200&width=200"
,
    },
    {
      id: 5,
      name: "Chicken Pizza Medium (2-3 People)",
      description: "Juicy chicken chunks, spicy jalapeños, and onions for a perfect kick.",
      originalPrice: 279,
      currentPrice: 209,
          image: "https://i.pinimg.com/736x/ec/1f/d3/ec1fd366a2a14042715fefeb346f5814.jpg?height=200&width=200"
,
    },
    {
      id: 6,
      name: "Chicken Pizza Large (Family)",
      description: "Loaded with chicken, mozzarella, herbs, and crispy crust for the whole family.",
      originalPrice: 249,
      currentPrice: 189,
          image: "https://i.pinimg.com/736x/ec/1f/d3/ec1fd366a2a14042715fefeb346f5814.jpg?height=200&width=200"
,
    },
    {
      id: 7,
      name: "Mushroom Pizza Small (1 Person)",
      description: "Personal-sized pizza with fresh mushrooms and mozzarella cheese.",
      originalPrice: 269,
      currentPrice: 199,
          image: "https://previews.123rf.com/images/radionphoto/radionphoto1702/radionphoto170200611/72031636-mushroom-pizza-mozzarella-mushrooms-isolated-on-white-background.jpg?height=200&width=200"
,
    },
    {
      id: 8,
      name: "Mushroom Pizza Medium (2-3 People)",
      description: "Medium mushroom pizza with a perfect blend of cheese and herbs.",
      originalPrice: 239,
      currentPrice: 179,
          image: "https://previews.123rf.com/images/radionphoto/radionphoto1702/radionphoto170200611/72031636-mushroom-pizza-mozzarella-mushrooms-isolated-on-white-background.jpg?height=200&width=200"
,
    },
    {
      id: 9,
      name: "Mushroom Pizza Large (Family)",
      description: "Family-size pizza generously topped with mushrooms and mozzarella.",
      originalPrice: 289,
      currentPrice: 219,
          image: "https://previews.123rf.com/images/radionphoto/radionphoto1702/radionphoto170200611/72031636-mushroom-pizza-mozzarella-mushrooms-isolated-on-white-background.jpg?height=200&width=200"
,
    },
    {
      id: 10,
      name: "Chicken Sausage Pizza Medium",
      description: "Smoky chicken sausage, caramelized onions, and bell peppers on a golden crust.",
      originalPrice: 299,
      currentPrice: 229,
          image: "https://www.cupofzest.com/wp-content/uploads/2022/06/Chicken-Sausage-Pizza-with-Onions-and-Peppers-Thumbnail.jpg?height=200&width=200"
,
    },
  ]

  return (
    <div className="min-h-screen bg-gradient-to-b from-amber-50 to-orange-50">
      <header className="py-6 md:py-10 px-4 text-center">
        <div className="flex justify-center items-center gap-4 mb-4">
          <Image src="/images/logo.png" alt="Classic Pizza Logo" width={80} height={80} className="rounded-full" />
          <h1 className="text-3xl md:text-5xl font-bold mb-2">
            <span className="text-[#ff3131]">Classic</span> Pizza
          </h1>
        </div>
        <p className="text-lg text-gray-600 max-w-2xl mx-auto">
          Enjoy our special discount prices on all your favorite pizzas!
        </p>
      </header>

      <main className="container mx-auto px-4 pb-16">
        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 gap-6 md:gap-8">
          {pizzas.map((pizza) => (
            <div
              key={pizza.id}
              className="bg-white rounded-xl overflow-hidden shadow-lg hover:shadow-xl transition-shadow duration-300"
            >
              <div className="relative h-48 sm:h-52 md:h-56 overflow-hidden">
                <Image
                  src={pizza.image || "/placeholder.svg"}
                  alt={pizza.name}
                  fill
                  className="object-cover transition-transform duration-300 hover:scale-105"
                  sizes="(max-width: 640px) 100vw, (max-width: 1024px) 50vw, 25vw"
                />
                <Badge className="absolute top-3 right-3 bg-red-500 hover:bg-red-600">
                  {Math.round(((pizza.originalPrice - pizza.currentPrice) / pizza.originalPrice) * 100)}% OFF
                </Badge>
              </div>

              <div className="p-4">
                <h3 className="font-bold text-lg text-[#37b5fd] mb-1">{pizza.name}</h3>
                <p className="text-gray-600 text-sm mb-3">{pizza.description}</p>

                <div className="flex items-center">
                  <span className="text-gray-500 line-through mr-2">Rs. {pizza.originalPrice}</span>
                  <span className="text-xl font-bold text-orange-600">Rs. {pizza.currentPrice}</span>
                </div>
              </div>
            </div>
          ))}
        </div>
      </main>

     <footer className="bg-gray-800 text-white py-6">
  <div className="container mx-auto px-4">
    <div className="flex flex-col md:flex-row justify-between items-center">
      <p className="mb-4 md:mb-0">© 2025 Classic Pizza — Delivery only in Butwal (45–60 min)</p>
      <div className="flex space-x-6 items-center">
        <a
          href="https://www.facebook.com/classicpizzanepal"
          target="_blank"
          rel="noopener noreferrer"
          className="hover:text-[#37b5fd] transition-colors"
        >
          <Facebook size={24} />
          <span className="sr-only">Facebook</span>
        </a>
        <a
          href="https://www.instagram.com/classicpizzanepal"
          target="_blank"
          rel="noopener noreferrer"
          className="hover:text-[#e1306c] transition-colors"
        >
          <Instagram size={24} />
          <span className="sr-only">Instagram</span>
        </a>
        <a
          href="https://www.youtube.com/@classicpizzanepal"
          target="_blank"
          rel="noopener noreferrer"
          className="hover:text-[#ff0000] transition-colors"
        >
          <Youtube size={24} />
          <span className="sr-only">YouTube</span>
        </a>
        <a
          href="https://wa.me/9867034588"
          target="_blank"
          rel="noopener noreferrer"
          className="hover:text-[#25D366] transition-colors"
        >
          <Phone size={24} />
          <span className="sr-only">WhatsApp 9867034588</span>
        </a>
        <a
          href="https://wa.me/9706631613"
          target="_blank"
          rel="noopener noreferrer"
          className="hover:text-[#25D366] transition-colors"
        >
          <Phone size={24} />
          <span className="sr-only">WhatsApp 9706631613</span>
        </a>
      </div>
    </div>
  </div>
</footer>

    </div>
  )
}
