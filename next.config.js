// Add this next.config.js file to properly configure image domains if needed in the future

/** @type {import('next').NextConfig} */
const nextConfig = {
  images: {
    domains: ["placeholder.svg"],
    remotePatterns: [
      {
        protocol: "https",
        hostname: "**",
      },
    ],
  },
}

module.exports = nextConfig
