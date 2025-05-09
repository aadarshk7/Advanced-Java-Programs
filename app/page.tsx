import Image from "next/image"
import { Facebook, Instagram, Youtube, Phone } from "lucide-react"

export default function PizzaMenu() {
  // Pizza data array
  const pizzas = [
    {
      id: 1,
      name: "Veg Pizza Small",
      description: "Fresh tomatoes, mozzarella, basil",
      originalPrice: 250,
      currentPrice: 149,
    },
    {
      id: 2,
      name: "Pepperoni Pizza",
      description: "Pepperoni, extra cheese, oregano",
      originalPrice: 249,
      currentPrice: 189,
    },
    {
      id: 3,
      name: "Veggie Supreme",
      description: "Bell peppers, mushrooms, onions, olives",
      originalPrice: 229,
      currentPrice: 179,
    },
    {
      id: 4,
      name: "BBQ Chicken",
      description: "Grilled chicken, BBQ sauce, red onions",
      originalPrice: 269,
      currentPrice: 199,
    },
    {
      id: 5,
      name: "Hawaiian Delight",
      description: "Ham, pineapple, extra cheese",
      originalPrice: 239,
      currentPrice: 179,
    },
    {
      id: 6,
      name: "Meat Lovers",
      description: "Pepperoni, sausage, bacon, ground beef",
      originalPrice: 289,
      currentPrice: 219,
    },
    {
      id: 7,
      name: "Spicy Mexican",
      description: "Jalapeños, ground beef, bell peppers, onions",
      originalPrice: 259,
      currentPrice: 199,
    },
    {
      id: 8,
      name: "Mushroom Truffle",
      description: "Assorted mushrooms, truffle oil, arugula",
      originalPrice: 279,
      currentPrice: 209,
    },
    {
      id: 9,
      name: "Four Cheese",
      description: "Mozzarella, cheddar, parmesan, gorgonzola",
      originalPrice: 249,
      currentPrice: 189,
    },
    {
      id: 10,
      name: "Seafood Special",
      description: "Shrimp, calamari, mussels, fresh herbs",
      originalPrice: 299,
      currentPrice: 229,
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
              <div className="relative h-48 sm:h-52 md:h-56 overflow-hidden bg-gray-200">
                <div className="absolute inset-0 flex items-center justify-center text-gray-400">Pizza Image</div>
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
            <p className="mb-4 md:mb-0">© 2025 Classic Pizza</p>
            <div className="flex space-x-6">
              <a href="#" className="hover:text-[#37b5fd] transition-colors">
                <Facebook size={24} />
              </a>
              <a href="#" className="hover:text-[#37b5fd] transition-colors">
                <Instagram size={24} />
              </a>
              <a href="#" className="hover:text-[#37b5fd] transition-colors">
                <Youtube size={24} />
              </a>
              <a href="#" className="hover:text-[#37b5fd] transition-colors">
                <Phone size={24} />
              </a>
            </div>
          </div>
        </div>
      </footer>
    </div>
  )
}
